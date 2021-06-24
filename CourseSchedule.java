package src;
import java.util.*;
import java.util.Map.Entry;
public class CourseSchedule {

	public CourseSchedule() {
		// TODO Auto-generated constructor stub
	}
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> courses = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++) {
        	if(!courses.containsKey(prerequisites[i][0])) {
        		courses.put(prerequisites[i][0], new ArrayList<Integer>());
        	}              
        	courses.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        HashSet<Integer> visited = new HashSet<>();
        for (Map.Entry<Integer, ArrayList<Integer>> e : courses.entrySet()) {
			boolean a = dfs(courses, e.getKey(), visited);
            if(!a) return false;
		}
        return true;
    }
    
    public boolean dfs(HashMap<Integer, ArrayList<Integer>> courses, int course_visiting, 
                      HashSet<Integer> visited){
        if(visited.contains(course_visiting))
            return false;
        if(courses.get(course_visiting) == null) //if there is no pre-requisite
            return true;
        
        visited.add(course_visiting);
        for(int pre: courses.get(course_visiting))
            if(!dfs(courses,pre,visited)) return false;
        visited.remove(course_visiting);
        courses.replace(course_visiting, null);
        return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] prerequisites = {{1,0},{0,1}};
		CourseSchedule a = new CourseSchedule();
		System.out.print(a.canFinish(2, prerequisites));
	}

}
