package com.example.commelanicatatankimia

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var judulHalaman: TextView
    private lateinit var isiHalaman: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        judulHalaman = findViewById(R.id.judulHalaman)
        isiHalaman = findViewById(R.id.isiHalaman)

        val tombolMateri = findViewById<Button>(R.id.tombolMateri)
        val tombolTabelPeriodik = findViewById<Button>(R.id.tombolTabelPeriodik)
        val tombolPraktikum = findViewById<Button>(R.id.tombolPraktikum)
        val tombolKuis = findViewById<Button>(R.id.tombolKuis)

        tombolMateri.setOnClickListener {
            judulHalaman.text = "Materi Kimia"
            isiHalaman.text =
                "Stoikiometri\n\nMol adalah satuan jumlah zat.\n\nRumus:\nJumlah Mol = Massa / Mr"
        }

        tombolTabelPeriodik.setOnClickListener {
            judulHalaman.text = "Tabel Periodik"
            isiHalaman.text =
                "H = Hidrogen\nHe = Helium\nLi = Litium\nBe = Berilium\nB = Boron"
        }

        tombolPraktikum.setOnClickListener {
            judulHalaman.text = "Praktikum Virtual"
            isiHalaman.text =
                "Simulasi:\n\nLarutan asam ditambahkan indikator.\nHasil: warna berubah menjadi merah."
        }

        tombolKuis.setOnClickListener {
            judulHalaman.text = "Kuis Kimia"
            isiHalaman.text =
                "Pertanyaan:\n\nApa simbol unsur Natrium?\n\nJawaban: Na"
        }
    }
}
