package com.google.Tutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User>  Users) {
        super(context,0, Users);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.user_item, parent, false);
        }

        User currentUser = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView);

        nameTextView.setText(currentUser.getName());


        return listItemView;
    }
}
