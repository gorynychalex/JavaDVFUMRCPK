package ru.dvfu.mrcpk.tests.lambdas;

@FunctionalInterface
interface WorkerInterface{
        void doWork();
}

public class LambdaApp {

    public static void execute(WorkerInterface workerInterface){
        workerInterface.doWork();
    }

    public static void main(String[] args) {
        //Classical method issue, throw anonumous class
        execute(new WorkerInterface(){

            @Override
            public void doWork() {
                System.out.println("Function interface");
            }
        });

        execute( () -> System.out.println("Function interface NEw") );
    }

}
