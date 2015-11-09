package org.androidtown.simplediary;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SOYOUNG on 2015-11-07.
 */
public class schedulelistAdapter extends BaseAdapter {

    private Context mContext;

    private List<schedulelistitem> mItems = new ArrayList<schedulelistitem>();

    public schedulelistAdapter(Context context) {
        mContext = context;
    }

    public void clear() {
        mItems.clear();
    }

    public void addItem(schedulelistitem it) {
        mItems.add(it);
    }

    public void setListItems(List<schedulelistitem> lit) {
        mItems = lit;
    }

    public int getCount() {
        return mItems.size();
    }

    public Object getItem(int position) {
        return mItems.get(position);
    }

    public boolean areAllItemsSelectable() {
        return false;
    }

    public boolean isSelectable(int position) {
        try {
            return mItems.get(position).isSelectable();
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position,View convertView, ViewGroup parent){

        schedulelistitemView itemView;
        if (convertView == null){

            itemView = new schedulelistitemView(mContext);
        } else {

            itemView = (schedulelistitemView) convertView;
        }

        itemView.setContents(0, ((String) mItems.get(position).getData(0)));
        itemView.setContents(1, ((String) mItems.get(position).getData(1)));

        return itemView;

    }
}
