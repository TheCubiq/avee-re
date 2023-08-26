.class public Lcom/daaw/avee/comp/Shoutcast/Crave;
.super Ljava/lang/Object;
.source "Crave.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static decry(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 133
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 134
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 135
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 136
    invoke-static {v2}, Lcom/daaw/avee/comp/Shoutcast/Crave;->decryCh(C)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static decryCh(C)C
    .locals 5

    const/16 v0, 0x27

    if-eq p0, v0, :cond_5

    const/16 v0, 0x3b

    if-eq p0, v0, :cond_4

    const/16 v1, 0x3d

    if-eq p0, v1, :cond_3

    const/16 v2, 0x5b

    if-eq p0, v2, :cond_2

    const/16 v3, 0x5d

    if-eq p0, v3, :cond_1

    const/16 v4, 0x7d

    if-eq p0, v4, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    return p0

    :pswitch_0
    const/16 p0, 0x74

    return p0

    :pswitch_1
    const/16 p0, 0x76

    return p0

    :pswitch_2
    const/16 p0, 0x37

    return p0

    :pswitch_3
    const/16 p0, 0x73

    return p0

    :pswitch_4
    const/16 p0, 0x75

    return p0

    :pswitch_5
    const/16 p0, 0x30

    return p0

    :pswitch_6
    const/16 p0, 0x31

    return p0

    :pswitch_7
    return v0

    :pswitch_8
    const/16 p0, 0x6b

    return p0

    :pswitch_9
    const/16 p0, 0x62

    return p0

    :pswitch_a
    return v2

    :pswitch_b
    return v3

    :pswitch_c
    const/16 p0, 0x6d

    return p0

    :pswitch_d
    const/16 p0, 0x63

    return p0

    :pswitch_e
    const/16 p0, 0x33

    return p0

    :pswitch_f
    const/16 p0, 0x6f

    return p0

    :pswitch_10
    const/16 p0, 0x78

    return p0

    :pswitch_11
    const/16 p0, 0x65

    return p0

    :pswitch_12
    const/16 p0, 0x79

    return p0

    :pswitch_13
    const/16 p0, 0x67

    return p0

    :pswitch_14
    const/16 p0, 0x32

    return p0

    :pswitch_15
    const/16 p0, 0x2c

    return p0

    :pswitch_16
    const/16 p0, 0x35

    return p0

    :pswitch_17
    const/16 p0, 0x36

    return p0

    :pswitch_18
    const/16 p0, 0x71

    return p0

    :pswitch_19
    const/16 p0, 0x38

    return p0

    :pswitch_1a
    const/16 p0, 0x66

    return p0

    :pswitch_1b
    return v1

    :pswitch_1c
    const/16 p0, 0x64

    return p0

    :pswitch_1d
    const/16 p0, 0x68

    return p0

    :pswitch_1e
    const/16 p0, 0x61

    return p0

    :pswitch_1f
    const/16 p0, 0x6e

    return p0

    :pswitch_20
    const/16 p0, 0x77

    return p0

    :pswitch_21
    const/16 p0, 0x70

    return p0

    :pswitch_22
    const/16 p0, 0x72

    return p0

    :pswitch_23
    const/16 p0, 0x7b

    return p0

    :pswitch_24
    const/16 p0, 0x39

    return p0

    :pswitch_25
    return v4

    :pswitch_26
    const/16 p0, 0x6a

    return p0

    :pswitch_27
    const/16 p0, 0x7a

    return p0

    :cond_0
    const/16 p0, 0x34

    return p0

    :cond_1
    const/16 p0, 0x2e

    return p0

    :cond_2
    const/16 p0, 0x2d

    return p0

    :cond_3
    const/16 p0, 0x69

    return p0

    :cond_4
    const/16 p0, 0x6c

    return p0

    :cond_5
    return v0

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static encry(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 121
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 122
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 123
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 124
    invoke-static {v2}, Lcom/daaw/avee/comp/Shoutcast/Crave;->encryCh(C)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 126
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static encryCh(C)C
    .locals 5

    const/16 v0, 0x27

    if-eq p0, v0, :cond_5

    const/16 v0, 0x3b

    if-eq p0, v0, :cond_4

    const/16 v1, 0x3d

    if-eq p0, v1, :cond_3

    const/16 v2, 0x5b

    if-eq p0, v2, :cond_2

    const/16 v3, 0x5d

    if-eq p0, v3, :cond_1

    const/16 v4, 0x7d

    if-eq p0, v4, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    return p0

    :pswitch_0
    const/16 p0, 0x31

    return p0

    :pswitch_1
    const/16 p0, 0x2c

    return p0

    :pswitch_2
    const/16 p0, 0x69

    return p0

    :pswitch_3
    const/16 p0, 0x6b

    return p0

    :pswitch_4
    const/16 p0, 0x34

    return p0

    :pswitch_5
    const/16 p0, 0x7a

    return p0

    :pswitch_6
    const/16 p0, 0x77

    return p0

    :pswitch_7
    const/16 p0, 0x7b

    return p0

    :pswitch_8
    const/16 p0, 0x78

    return p0

    :pswitch_9
    const/16 p0, 0x32

    return p0

    :pswitch_a
    const/16 p0, 0x63

    return p0

    :pswitch_b
    const/16 p0, 0x33

    return p0

    :pswitch_c
    const/16 p0, 0x6c

    return p0

    :pswitch_d
    const/16 p0, 0x35

    return p0

    :pswitch_e
    const/16 p0, 0x6f

    return p0

    :pswitch_f
    return v0

    :pswitch_10
    const/16 p0, 0x73

    return p0

    :pswitch_11
    const/16 p0, 0x2d

    return p0

    :pswitch_12
    return v1

    :pswitch_13
    const/16 p0, 0x37

    return p0

    :pswitch_14
    const/16 p0, 0x68

    return p0

    :pswitch_15
    const/16 p0, 0x61

    return p0

    :pswitch_16
    const/16 p0, 0x6a

    return p0

    :pswitch_17
    const/16 p0, 0x38

    return p0

    :pswitch_18
    const/16 p0, 0x6e

    return p0

    :pswitch_19
    const/16 p0, 0x72

    return p0

    :pswitch_1a
    const/16 p0, 0x36

    return p0

    :pswitch_1b
    const/16 p0, 0x30

    return p0

    :pswitch_1c
    const/16 p0, 0x62

    return p0

    :pswitch_1d
    const/16 p0, 0x79

    return p0

    :pswitch_1e
    const/16 p0, 0x64

    return p0

    :pswitch_1f
    const/16 p0, 0x65

    return p0

    :pswitch_20
    return v4

    :pswitch_21
    const/16 p0, 0x6d

    return p0

    :pswitch_22
    const/16 p0, 0x67

    return p0

    :pswitch_23
    const/16 p0, 0x75

    return p0

    :pswitch_24
    const/16 p0, 0x76

    return p0

    :pswitch_25
    return v3

    :pswitch_26
    return v2

    :pswitch_27
    const/16 p0, 0x66

    return p0

    :cond_0
    const/16 p0, 0x2e

    return p0

    :cond_1
    const/16 p0, 0x70

    return p0

    :cond_2
    const/16 p0, 0x71

    return p0

    :cond_3
    const/16 p0, 0x39

    return p0

    :cond_4
    const/16 p0, 0x74

    return p0

    :cond_5
    return v0

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static iscry(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 143
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 146
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 147
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 149
    invoke-static {v2}, Lcom/daaw/avee/comp/Shoutcast/Crave;->decryCh(C)C

    move-result v3

    if-eq v3, v2, :cond_2

    const/16 p0, 0x7b

    .line 152
    invoke-static {p0}, Lcom/daaw/avee/comp/Shoutcast/Crave;->encryCh(C)C

    move-result p0

    if-ne v2, p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method
