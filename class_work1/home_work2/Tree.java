package com.company.home_work2;

class Tree {
    public static void main(String[] args) {

    }
}

class Cars {
    protected int tankCapacity;
    protected int fuelConsumption;
    protected int mileage = 0;

    Cars(int tankCapacity, int fuelConsumption) {
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    Cars(int tankCapacity, int fuelConsumption, int mileage) {
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        this.mileage = mileage;
    }

    protected void maxDistance() {
        int maxDistance = tankCapacity/fuelConsumption*100;
        System.out.println(maxDistance);
    }

    protected void goTo(int km) {
        mileage += km;
    }
}


class Toyota extends Cars {
    Toyota(int tankCapacity, int fuelConsumption) {
        super(tankCapacity, fuelConsumption);
    }

    Toyota(int tankCapacity, int fuelConsumption, int mileage) {
        super(tankCapacity, fuelConsumption, mileage);
    }

    @Override
    protected void maxDistance() {
        System.out.println("Эта машина фирмы Toyota способна проехать: ");
        super.maxDistance();
    }

    @Override
    protected void goTo(int km) {
        if (mileage == 0) {
            System.out.println("Машина была новой ");
        }
        super.goTo(km);
    }
}

class RAV4 extends Toyota {
    RAV4(int tankCapacity, int fuelConsumption) {
        super(tankCapacity, fuelConsumption);
    }

    RAV4(int tankCapacity, int fuelConsumption, int mileage) {
        super(tankCapacity, fuelConsumption, mileage);
    }

    @Override
    protected void maxDistance() {
        System.out.println("Это же RAV4! Эта машина может проехать сколько угодно!");
    }

    @Override
    protected void goTo(int km) {
        super.goTo(km);
        System.out.println("У этой машины (Toyota RAV4) пробег: " + mileage + " км");
    }
}
