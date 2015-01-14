package com.dennisbonke.testapi.energy;

import net.minecraftforge.common.util.ForgeDirection;

public abstract interface IEnergyReceiver extends IEnergyConnection {

    public abstract int receiveEnergy(ForgeDirection direction, int amount, boolean possible);

    public abstract int getEnergyStored(ForgeDirection direction);

    public abstract int getMaxEnergyStored(ForgeDirection direction);

}
