package fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.example.sagar.loginsinupdesigns.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }
    View view;

    RelativeLayout layout1,layout2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.test, container, false);

        layout1=view.findViewById(R.id.layout1);
        layout2=view.findViewById(R.id.layout2);

        final Animation slide_in_up = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_up);
        final Animation slide_in_down = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_in_down);

        layout1.startAnimation(slide_in_down);
        layout2.startAnimation(slide_in_up);

        return view;
    }

}
