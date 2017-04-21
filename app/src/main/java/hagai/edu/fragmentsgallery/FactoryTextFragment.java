package hagai.edu.fragmentsgallery;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FactoryTextFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FactoryTextFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "Home";
    private static final String ARG_PARAM2 = "Color2";

    // TODO: Rename and change types of parameters
    private String home;
    private String color2;


    public FactoryTextFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FactoryTextFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FactoryTextFragment newInstance(String param1, String param2) {
        FactoryTextFragment fragment = new FactoryTextFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1,home );
        args.putString(ARG_PARAM2, color2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            home = getArguments().getString(ARG_PARAM1);
            color2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_factory_text, container, false);
    }

}
