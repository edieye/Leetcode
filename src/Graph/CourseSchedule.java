package Graph;

/**
 * Created by edieye on 2020-06-02.
 */

import java.util.ArrayDeque;

/** 207. Course Schedule **/
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        int count = 0;
        for (int[] prerequisite: prerequisites) {
            degree[prerequisite[0]]++;
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int[] prerequisite: prerequisites) {
                if (course == prerequisite[1]) {
                    degree[prerequisite[0]]--;
                    if (degree[prerequisite[0]] == 0) {
                        queue.add(prerequisite[0]);
                    }
                }
            }
        }
        return count == numCourses;
    }

    public static void main(String[] args) {
        int courses = 2;
        int[][] prereq = {{0,1}};
        CourseSchedule obj = new CourseSchedule();
        System.out.println(obj.canFinish(courses, prereq));
    }

}
