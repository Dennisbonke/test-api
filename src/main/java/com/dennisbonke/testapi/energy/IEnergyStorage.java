package com.dennisbonke.testapi.energy;

public abstract interface IEnergyStorage {

    public abstract int receiveEnergy(int amount, boolean possible);

    public abstract int extractEnergy(int amount, boolean possible);

    public abstract int getEnergyStored();

    public abstract int getMaxEnergyStored();

}
