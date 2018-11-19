package kung.com.dcsoft.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {



//    Override method กด Alt+ins
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Register Controller
        TextView textView = getView().findViewById(R.id.textViewRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Replace Fragment
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragment, new RegisterFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    } //Main Method

    public MainFragment() {
        // Required empty public constructor
    } // Consturctor ส่งที่ใช้ในการเชื่อมต่อข้อมูล  ตัว constructor จะชื่อเดียวกับ Class


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }//Create View หน้าที่ของ method นี้สร้างหน้ากาก

}//Main Class
