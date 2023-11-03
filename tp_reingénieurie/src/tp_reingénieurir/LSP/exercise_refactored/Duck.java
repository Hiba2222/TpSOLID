package tp_reingénieurir.LSP.exercise_refactored;

public class Duck implements DuckInterface
{
	@Override
    public void quack()
    {
        System.out.println("Quack...");
    }

	@Override
    public void swim()
    {
        System.out.println("Swim...");
    }
}