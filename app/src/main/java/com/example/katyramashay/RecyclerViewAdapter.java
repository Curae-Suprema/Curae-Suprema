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

    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item, parent, false);
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

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView taskTime;
        public TextView taskName;
        public CheckBox taskCheckBox;

        ViewHolder(View itemView) {
            super(itemView);
            taskTime = itemView.findViewById(R.id.taskTime);
            taskName = itemView.findViewById(R.id.taskName);
            taskCheckBox = itemView.findViewById(R.id.taskCheckBox);
        }
    }
}
