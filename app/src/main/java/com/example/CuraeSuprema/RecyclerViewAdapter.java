package com.example.CuraeSuprema;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.CuraeSuprema.DataModelingClasses.Exercise;
import com.example.CuraeSuprema.DataModelingClasses.Meal;
import com.example.CuraeSuprema.DataModelingClasses.Shower;
import com.example.CuraeSuprema.DataModelingClasses.Sleep;
import com.example.CuraeSuprema.DataModelingClasses.Socialization;
import com.example.CuraeSuprema.DataModelingClasses.Task;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final ArrayList<Task> tasks;
    private OnItemClickListener listener;

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

        holder.taskCheckBox.setOnClickListener(view ->
                task.setCompletion(holder.taskCheckBox.isChecked()));
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView taskTime;
        private final TextView taskName;
        private final CheckBox taskCheckBox;

        public ViewHolder(View itemView) {
            super(itemView);
            taskTime = itemView.findViewById(R.id.taskTime);
            taskName = itemView.findViewById(R.id.taskName);
            taskCheckBox = itemView.findViewById(R.id.taskCheckBox);

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                Task t = tasks.get(position);
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    if (t instanceof Shower)
                        listener.onItemClick((Shower) t, position);
                    else if (t instanceof Meal)
                        listener.onItemClick((Meal) t, position);
                    else if (t instanceof Sleep)
                        listener.onItemClick((Sleep) t, position);
                    else if (t instanceof Exercise)
                        listener.onItemClick((Exercise) t, position);
                    else if (t instanceof Socialization)
                        listener.onItemClick((Socialization) t, position);
                    else
                        listener.onItemClick(t, position);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Shower shower, int position);
        void onItemClick(Meal meal, int position);
        void onItemClick(Sleep sleep, int position);
        void onItemClick(Exercise exercise, int position);
        void onItemClick(Socialization socialization, int position);
        void onItemClick(Task task, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
