package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    private AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.arch = i;
        this.model = str;
        this.cores = i2;
        this.ram = j;
        this.diskSpace = j2;
        this.simulator = z;
        this.state = i3;
        this.manufacturer = str2;
        this.modelClass = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModel() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.cores;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.ram;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.diskSpace;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.simulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.state;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public String getModelClass() {
        return this.modelClass;
    }

    public String toString() {
        return "Device{arch=" + this.arch + ", model=" + this.model + ", cores=" + this.cores + ", ram=" + this.ram + ", diskSpace=" + this.diskSpace + ", simulator=" + this.simulator + ", state=" + this.state + ", manufacturer=" + this.manufacturer + ", modelClass=" + this.modelClass + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Device) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            return this.arch == device.getArch() && this.model.equals(device.getModel()) && this.cores == device.getCores() && this.ram == device.getRam() && this.diskSpace == device.getDiskSpace() && this.simulator == device.isSimulator() && this.state == device.getState() && this.manufacturer.equals(device.getManufacturer()) && this.modelClass.equals(device.getModelClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.ram;
        long j2 = this.diskSpace;
        return ((((((((((((((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cores) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.simulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {
        private Integer arch;
        private Integer cores;
        private Long diskSpace;
        private String manufacturer;
        private String model;
        private String modelClass;
        private Long ram;
        private Boolean simulator;
        private Integer state;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.arch = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.model = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.cores = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.ram = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.diskSpace = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.simulator = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.state = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.modelClass = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String str = "";
            if (this.arch == null) {
                str = " arch";
            }
            if (this.model == null) {
                str = str + " model";
            }
            if (this.cores == null) {
                str = str + " cores";
            }
            if (this.ram == null) {
                str = str + " ram";
            }
            if (this.diskSpace == null) {
                str = str + " diskSpace";
            }
            if (this.simulator == null) {
                str = str + " simulator";
            }
            if (this.state == null) {
                str = str + " state";
            }
            if (this.manufacturer == null) {
                str = str + " manufacturer";
            }
            if (this.modelClass == null) {
                str = str + " modelClass";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new AutoValue_CrashlyticsReport_Session_Device(this.arch.intValue(), this.model, this.cores.intValue(), this.ram.longValue(), this.diskSpace.longValue(), this.simulator.booleanValue(), this.state.intValue(), this.manufacturer, this.modelClass);
        }
    }
}
