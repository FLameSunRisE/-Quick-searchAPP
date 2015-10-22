package com.example.sun.bar1022;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {
    setOnPageChangeListener mCallback;

    public PageFragment() {
        // Required empty public constructor

    }
    public interface setOnPageChangeListener{
        public void onArticleSelected (int position);
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (setOnPageChangeListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement setOnPageChangeListener");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_page, container, false);
        View v = inflater.inflate(R.layout.fragment_page, container, false);
        return  v;
    }


}
