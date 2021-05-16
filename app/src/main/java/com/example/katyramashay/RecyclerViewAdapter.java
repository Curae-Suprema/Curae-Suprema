package com.example.katyramashay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.katyramashay.DataModelingClasses.Task;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Task> tasks;

    public RecyclerViewAdapter(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daily_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.taskTime.setText(task.getReminder());
        holder.taskName.setText(task.getTaskName());
        holder.taskCheckBox.setChecked(task.getCompletion());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView taskTime;
        private final TextView taskName;
        private final CheckBox taskCheckBox;

        ViewHolder(View itemView) {
            super(itemView);
            taskTime = (TextView) itemView.findViewById(R.id.taskTime);
            taskName = (TextView) itemView.findViewById(R.id.taskName);
            taskCheckBox = (CheckBox) itemView.findViewById(R.id.taskCheckBox);
        }
    }
}
