package com.example.scheduler.ui.Map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.scheduler.R;
import com.example.scheduler.databinding.FragmentMapBinding;
import com.google.android.material.snackbar.Snackbar;

public class MapFragment extends Fragment {

    private FragmentMapBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Snackbar.make(getActivity().findViewById(android.R.id.content), "There was an error with Google Maps", Snackbar.LENGTH_LONG).show();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}