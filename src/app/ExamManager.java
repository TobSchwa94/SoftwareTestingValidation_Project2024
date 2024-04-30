public class ExamManager {

	public enum ManagerMode { OPEN, PUBLISHED, TERMINATED, EVALUATION; }
public ExamManager(ExamModel model) { /* ... */ }

// Returns the mode of this exam manager
public final ManagerMode getMode() {
	return null; /* ... */ }

// Enrolls a student for this exam
public void enroll(Student t) { /* ... */ }

// Cancels start and close operations
public void cancel() { /* ... */ }

// Returns an exam for the (enrolled) student
public Exam getExam(Student student) {
	return null; /* ... */ }

// Submits an exam
public void submit(Exam exam) { /* ... */ }

// Finish current state (
public void close() { /* ... */ }

// Returns the evaluation of the exam made by the specified student
public float evaluate(Student student) {
	return 0; /* ... */ }

}