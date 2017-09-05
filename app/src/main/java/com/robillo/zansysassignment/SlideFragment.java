package com.robillo.zansysassignment;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SlideFragment extends Fragment {

    ImageView mImageView;

    public SlideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_slide, container, false);
        mImageView = v.findViewById(R.id.image_view);
        Bundle args = getArguments();
        String url = args.getString("url");
        setImage(url);
        return v;
    }

    private void setImage(String url) {
        Bitmap bmImg = BitmapFactory.decodeFile(url);
        mImageView.setImageBitmap(bmImg);
    }

}
