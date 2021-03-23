package com.example.trab3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class CervejasDetailFragment extends Fragment {
    private long cervejasId;

    public View onCreateView(LayoutInflater inflater , ViewGroup container,
                             Bundle savedInstanceState){
        if(savedInstanceState !=null){
            cervejasId = savedInstanceState.getLong("cervejasId");

        }
        return inflater.inflate(R.layout.fragment_cervejas_detail,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Cervejas cervejas = Cervejas.consoles[(int) cervejasId];
            TextView title = view.findViewById(R.id.textTile);
            title.setText(cervejas.getName());
            TextView description = view.findViewById(R.id.textDescription);
            description.setText(cervejas.getDescription());

        }
    }
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("cervejasId", cervejasId);

    }

    public void setCervejas(long id) {
        this.cervejasId = id;
    }
}
