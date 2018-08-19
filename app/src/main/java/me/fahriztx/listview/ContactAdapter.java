package me.fahriztx.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private List<ContactModel> mItems;

    public ContactAdapter(List<ContactModel> items) {
        mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_contact, parent, false);

        ImageView avatar = itemView.findViewById(R.id.iv_avatar);
        TextView name = itemView.findViewById(R.id.tv_name);
        TextView phone = itemView.findViewById(R.id.tv_phone);

        ContactModel model = mItems.get(position);

        avatar.setImageResource(model.getAvatar());
        name.setText(model.getName());
        phone.setText(model.getPhone());

        return itemView;
    }
}
