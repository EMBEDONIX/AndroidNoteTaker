package com.embedonix.notetaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by saeid on 5/8/2016.
 */
public class NoteAdapter extends ArrayAdapter<Note> {

    public NoteAdapter(Context context, int resource, List<Note> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.view_note_item, null);
        }

        Note note = getItem(position);

        if(note != null) {
            TextView title = (TextView) convertView.findViewById(R.id.tv_note_title);
            TextView date = (TextView) convertView.findViewById(R.id.tv_note_date);
            TextView content = (TextView) convertView.findViewById(R.id.tv_note_content_preview);

            title.setText(note.getTitle());
            date.setText(note.getDateTimeFormatted());

            //if content is big...we take only the first 50 characters!
            if(note.getContent().length() > 50) {
                content.setText(note.getContent().substring(0,50) + "...");
            } else {
                content.setText(note.getContent());
            }
        }

        return convertView;
    }

}
