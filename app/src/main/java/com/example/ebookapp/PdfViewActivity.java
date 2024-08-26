package com.example.ebookapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {
PDFView pdfView;
TextView chapterName;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();}
        pdfView=findViewById(R.id.pdfView);
        chapterName=findViewById(R.id.chapterNames);
        int position=getIntent().getIntExtra("position",0);
        String chapter=getIntent().getStringExtra("name");
        if(position==0){
            pdfView.fromAsset("one.pdf").load();
            chapterName.setText(chapter);

        }
        else if(position==1){
            pdfView.fromAsset("two.pdf").load();
            chapterName.setText(chapter);

        }
        else if(position==2){
            pdfView.fromAsset("three.pdf").load();
            chapterName.setText(chapter);

        }
    }
}