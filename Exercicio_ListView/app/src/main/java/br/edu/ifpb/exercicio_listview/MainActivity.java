package br.edu.ifpb.exercicio_listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    public EditText searchField;
    public ListView listView;

    public ArrayList<CharSequence> pesquisa;
    public ArrayList<String> display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        pesquisa.add("Transistor");
        pesquisa.add("Red");
        pesquisa.add("Lillian Platt");
        pesquisa.add("Niola Chein");
        pesquisa.add("Wave tennegan");
        pesquisa.add("Preston Moyle");
        pesquisa.add("Shomar Shasberg");
        pesquisa.add("Henter Jallaford");
        pesquisa.add("Farrah Yon-Dale");
        pesquisa.add("Maximilias Darzi");
        pesquisa.add("Bailey Gilande");
        pesquisa.add("Olmarq");
        pesquisa.add("Camerata");
        pesquisa.add("Asher Kendrell");
        pesquisa.add("Grant Kendrell");
        pesquisa.add("Sybil Reisz");
        pesquisa.add("Royce Bracket");

    }

    public void setAdapter(){
        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, display);
        listView.setAdapter(adapter);
    }
}
