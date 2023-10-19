package Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ltdd_app_mang_xa_hoi.ProfileActivity;
import com.example.ltdd_app_mang_xa_hoi.R;

import java.util.ArrayList;

import Adapters.Friend_GroupAdapter;
import Dto.Friend_Group;

public class FriendFragment extends Fragment {

    ListView listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_friend, container, false);
        listview = view.findViewById(R.id.listviewfriend);
        ArrayList<Friend_Group> arrayList = new ArrayList<>();
        arrayList.add(new Friend_Group(R.drawable.avatar, "Nguyen Thanh An", 3, R.drawable.ic_send_sub, R.drawable.ic_tag));
        arrayList.add(new Friend_Group(R.drawable.belle_profile, "Belle Soriano", 3, R.drawable.ic_send_sub, R.drawable.ic_tag));
        arrayList.add(new Friend_Group(R.drawable.avatar, "Nguyen Thanh  2", 3, R.drawable.ic_send_sub, R.drawable.ic_tag));
        Friend_GroupAdapter adapter = new Friend_GroupAdapter(getContext(),R.layout.lv_friend_group,arrayList);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}