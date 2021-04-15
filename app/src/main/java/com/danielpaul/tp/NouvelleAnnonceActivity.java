package com.danielpaul.tp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.danielpaul.tp.models.AnnonceModel;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;

import java.io.File;
import java.util.Calendar;

public class NouvelleAnnonceActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    TextInputLayout champTitre, champDescription;
    Button btnValiderNouvelleAnnonce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouvelle_annonce);

        champTitre = findViewById(R.id.champTitre);
        champDescription = findViewById(R.id.champDescription);
        btnValiderNouvelleAnnonce = findViewById(R.id.btnValiderNouvelleAnnonce);
        btnValiderNouvelleAnnonce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnnonceModel annonce = new AnnonceModel();
                annonce.setTitre(champTitre.getEditText().getText().toString());
                annonce.setDescription(champDescription.getEditText().getText().toString());
                annonce.setDateAjout(Calendar.getInstance().getTime());
                Ajouter(annonce);
            }
        });
    }

    private void Ajouter(AnnonceModel annonce) {
        db.collection("annonces")
                .add(annonce)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(getApplicationContext(), "Annonce enregistrée avec succès !", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                    finish();
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), "Une erreur est survenue ", Toast.LENGTH_LONG).show();
                    }
                });
    }
}