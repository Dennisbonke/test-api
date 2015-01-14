package com.dennisbonke.testapi.energy;

import net.minecraftforge.common.util.ForgeDirection;

public abstract interface IEnergyProvider extends IEnergyConnection {

    public abstract int extractEnergy(ForgeDirection direction, int amount, boolean possible);

    public abstract int getEnergyStored(ForgeDirection direction);

    public abstract int getMaxEnergyStored(ForgeDirection direction);

}
