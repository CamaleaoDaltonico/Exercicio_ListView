package br.edu.ifpb.exercicio_listview.Listeners;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import br.edu.ifpb.exercicio_listview.MainActivity;

/**
 * Created by gabri on 25/09/2016.
 */
public class Watcher implements TextWatcher {
    MainActivity mainActivity;

    public Watcher(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        String sa = ".*"+s+".*";
        ArrayList<String> vazio = new ArrayList<String>();
        if (mainActivity.display.size()>0) {
            mainActivity.display=vazio;
        }

        for(int i=0; i < mainActivity.pesquisa.size(); i++){

            if(mainActivity.pesquisa.subList(i,i+1).get(0).toString().matches(sa){
                mainActivity.display.add(mainActivity.pesquisa.subList(i,i+1).get(0).toString());
            }

        }

        mainActivity.setAdapter();

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}

