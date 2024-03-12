package tester;

import static utils.TaskUtils.parseDate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.exam.core.Status;
import com.exam.core.Task;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, Task> hashmap = new HashMap<>();

			boolean flag = false;
			try {
				while (!flag) {
					System.out.println("1. Add New Task\r\n" + "2. Delete a task                         \r\n"
							+ "3. Update task status               \r\n" + "4. Display all pending tasks     \r\n"
							+ "5. Display all pending tasks for today           \r\n"
							+ "6.  Display all tasks sorted by taskDate");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Details : Task name, Task description, Task date");
						Task hm = new Task(sc.next(), sc.nextLine(), parseDate(sc.next()));
						hashmap.put(hm.getTaskId(), hm);
						System.out.println("Task Added");
						break;

					case 2:
						System.out.println("Enter Task id");
						int taskId = sc.nextInt();
						if (hashmap.containsKey(taskId)) {
							hashmap.get(taskId).setActive(false);
						}
						break;

					case 3:
						System.out.println("Enter TaskID and Status");
						int taskId1 = sc.nextInt();
						String newStatus = sc.next().toUpperCase();
						Status stat = Status.valueOf(newStatus);
						if (hashmap.containsKey(taskId1)) {
							hashmap.get(taskId1).setStatus(stat);
						}
						break;

					case 4:
						hashmap.values().stream().filter(task -> task.getStatus() == Status.PENDING && task.isActive())
								.forEach(task -> System.out.println(task));
						break;

					case 5:
						hashmap.values().stream()
								.filter(task -> task.isActive() && task.getStatus() == Status.PENDING
										&& task.getTaskDate().equals(LocalDate.now()))
								.forEach(task -> System.out.println(task));
						break;

					case 6:
						hashmap.values().stream().filter(task->task.getStatus() == Status.COMPLETED).sorted((t1, t2) -> t1.getTaskDate().compareTo(t2.getTaskDate()))
								.forEach(task -> System.out.println(task.getTaskName() + " " + task.getTaskDate()));
						break;
					case 0:
						flag = true;
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();

			}
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
