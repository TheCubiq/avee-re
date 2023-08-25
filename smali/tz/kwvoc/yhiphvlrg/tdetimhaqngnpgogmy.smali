.class public Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;
.super Landroidx/multidex/MultiDexApplication;
.source "PmsHookApplication.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# static fields
.field private static appPkgName:Ljava/lang/String; = ""

.field private static signatures:[Landroid/content/pm/Signature;


# instance fields
.field private base:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Landroidx/multidex/MultiDexApplication;-><init>()V

    return-void
.end method

.method private hook(Landroid/content/Context;)V
    .locals 29
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    move-object/from16 v1, p0

    .line 67
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    const-string v3, "AQAAAwcwggMDMIIB66ADAgECAgR/NichMA0GCSqGSIb3DQEBCwUAMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTAeFw0xNTA2MTcyMjAzMzBaFw00NTA2MDkyMjAzMzBaMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKcnQyyCJad1LlUs390771S5wf9aB1RQgBjrevJVwoeJ66qjWAftTZElly/nSmQuMBbe33Qqwc6sWBJc83arhH/Cj8ka+f71fBxC/Vc52kX7QygjtfQpkrEtEr4DoCdyT+MYq9BowCVKwphwarjrmpAm7BNklWdzqle+NgayYbJaSsoe3aWJCR/M/uKt2swMJPBFdv4RjNPqZGoO2/nC07pqG4NXDhyZ/oIwWRzmlunO/pdncT5OfWtwqHZUL4x/PiXFyU0S1XCeGy+nFb4u8ISU2vAks6nnXw+VodULW2tAVm7+/h7xdWdK1RdyWDc0IkpnaP323xqdKBSFarHnrBsCAwEAAaMhMB8wHQYDVR0OBBYEFIHW1i+nfP+N4ISKE0BnomCNmzX8MA0GCSqGSIb3DQEBCwUAA4IBAQCQqowpU4khL441yng9Heyp4E6KU1jVvtL2lPOZrS9wLW+PqWfHh2PyuauSGBLtHb3UIscrGgTwfcstpDvCf35ucLAuCQVqaaf3WEeMPph7/ldtOXA4yt9JYUwbEFpMJjp+9+zwj2+h84hmj8Q1BXHH2NVyb7NA3/u6HA940coyobvObkskST/Aq/4k31LLMB6coL7vD8lSVjCuiqjnQd6SStaPkhPXEi5KawV4gP+geGgq8+/5tbInn7rza7V3kXg1v5UR6/0lmyLWTYnuTS681UnhJ1jhEB5+rLocLG4ftEN54cA4VzkX9Cn2XgyOKrtAjmQsk4+HnCzpPjNvrdLC"

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 68
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    new-array v3, v2, [[B

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 70
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v6

    new-array v6, v6, [B

    aput-object v6, v3, v5

    .line 71
    aget-object v6, v3, v5

    invoke-virtual {v0, v6}, Ljava/io/DataInputStream;->readFully([B)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 73
    :cond_0
    sget-object v0, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    if-nez v0, :cond_1

    .line 74
    new-array v0, v2, [Landroid/content/pm/Signature;

    sput-object v0, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    const/4 v0, 0x0

    .line 75
    :goto_1
    sget-object v2, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    array-length v5, v2

    if-ge v0, v5, :cond_1

    .line 76
    new-instance v5, Landroid/content/pm/Signature;

    aget-object v6, v3, v0

    invoke-direct {v5, v6}, Landroid/content/pm/Signature;-><init>([B)V

    aput-object v5, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 80
    :cond_1
    new-instance v0, Ljava/lang/String;

    const/16 v2, 0x1a

    new-array v2, v2, [B

    const/16 v3, 0x61

    aput-byte v3, v2, v4

    const/16 v5, 0x6e

    const/4 v6, 0x1

    aput-byte v5, v2, v6

    const/4 v7, 0x2

    const/16 v8, 0x64

    aput-byte v8, v2, v7

    const/4 v9, 0x3

    const/16 v10, 0x72

    aput-byte v10, v2, v9

    const/16 v11, 0x6f

    const/4 v12, 0x4

    aput-byte v11, v2, v12

    const/4 v11, 0x5

    const/16 v13, 0x69

    aput-byte v13, v2, v11

    const/4 v14, 0x6

    aput-byte v8, v2, v14

    const/4 v15, 0x7

    const/16 v16, 0x2e

    aput-byte v16, v2, v15

    const/16 v17, 0x8

    aput-byte v3, v2, v17

    const/16 v18, 0x70

    const/16 v19, 0x9

    aput-byte v18, v2, v19

    const/16 v18, 0x70

    const/16 v20, 0xa

    aput-byte v18, v2, v20

    const/16 v18, 0xb

    aput-byte v16, v2, v18

    const/16 v21, 0x41

    const/16 v22, 0xc

    aput-byte v21, v2, v22

    const/16 v21, 0xd

    const/16 v23, 0x63

    aput-byte v23, v2, v21

    const/16 v21, 0xe

    const/16 v24, 0x74

    aput-byte v24, v2, v21

    const/16 v21, 0xf

    aput-byte v13, v2, v21

    const/16 v21, 0x10

    const/16 v25, 0x76

    aput-byte v25, v2, v21

    const/16 v21, 0x11

    aput-byte v13, v2, v21

    const/16 v21, 0x12

    aput-byte v24, v2, v21

    const/16 v21, 0x13

    const/16 v25, 0x79

    aput-byte v25, v2, v21

    const/16 v21, 0x14

    const/16 v25, 0x54

    aput-byte v25, v2, v21

    const/16 v21, 0x15

    const/16 v25, 0x68

    aput-byte v25, v2, v21

    const/16 v21, 0x16

    aput-byte v10, v2, v21

    const/16 v21, 0x17

    const/16 v25, 0x65

    aput-byte v25, v2, v21

    const/16 v21, 0x18

    aput-byte v3, v2, v21

    const/16 v21, 0x19

    aput-byte v8, v2, v21

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 81
    new-instance v2, Ljava/lang/String;

    const/16 v8, 0x15

    new-array v8, v8, [B

    aput-byte v23, v8, v4

    const/16 v26, 0x75

    aput-byte v26, v8, v6

    aput-byte v10, v8, v7

    aput-byte v10, v8, v9

    aput-byte v25, v8, v12

    aput-byte v5, v8, v11

    aput-byte v24, v8, v14

    const/16 v26, 0x41

    aput-byte v26, v8, v15

    aput-byte v23, v8, v17

    aput-byte v24, v8, v19

    aput-byte v13, v8, v20

    const/16 v26, 0x76

    aput-byte v26, v8, v18

    aput-byte v13, v8, v22

    const/16 v26, 0xd

    aput-byte v24, v8, v26

    const/16 v26, 0xe

    const/16 v27, 0x79

    aput-byte v27, v8, v26

    const/16 v26, 0xf

    const/16 v27, 0x54

    aput-byte v27, v8, v26

    const/16 v26, 0x10

    const/16 v27, 0x68

    aput-byte v27, v8, v26

    const/16 v26, 0x11

    aput-byte v10, v8, v26

    const/16 v26, 0x12

    aput-byte v25, v8, v26

    const/16 v26, 0x13

    aput-byte v3, v8, v26

    const/16 v26, 0x14

    const/16 v21, 0x64

    aput-byte v21, v8, v26

    invoke-direct {v2, v8}, Ljava/lang/String;-><init>([B)V

    new-array v8, v4, [Ljava/lang/Class;

    .line 83
    invoke-virtual {v0, v2, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v8, 0x0

    new-array v13, v4, [Ljava/lang/Object;

    .line 84
    invoke-virtual {v2, v8, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 87
    new-instance v8, Ljava/lang/String;

    const/16 v13, 0xf

    new-array v13, v13, [B

    const/16 v27, 0x73

    aput-byte v27, v13, v4

    const/16 v27, 0x50

    aput-byte v27, v13, v6

    aput-byte v3, v13, v7

    aput-byte v23, v13, v9

    const/16 v27, 0x6b

    aput-byte v27, v13, v12

    aput-byte v3, v13, v11

    const/16 v27, 0x67

    aput-byte v27, v13, v14

    aput-byte v25, v13, v15

    const/16 v27, 0x4d

    aput-byte v27, v13, v17

    aput-byte v3, v13, v19

    aput-byte v5, v13, v20

    aput-byte v3, v13, v18

    const/16 v27, 0x67

    aput-byte v27, v13, v22

    const/16 v27, 0xd

    aput-byte v25, v13, v27

    const/16 v27, 0xe

    aput-byte v10, v13, v27

    invoke-direct {v8, v13}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 88
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 92
    new-instance v13, Ljava/lang/String;

    const/16 v15, 0x22

    new-array v15, v15, [B

    aput-byte v3, v15, v4

    aput-byte v5, v15, v6

    const/16 v21, 0x64

    aput-byte v21, v15, v7

    aput-byte v10, v15, v9

    const/16 v28, 0x6f

    aput-byte v28, v15, v12

    const/16 v12, 0x69

    aput-byte v12, v15, v11

    aput-byte v21, v15, v14

    const/4 v11, 0x7

    aput-byte v16, v15, v11

    aput-byte v23, v15, v17

    const/16 v11, 0x6f

    aput-byte v11, v15, v19

    aput-byte v5, v15, v20

    aput-byte v24, v15, v18

    aput-byte v25, v15, v22

    const/16 v11, 0xd

    aput-byte v5, v15, v11

    const/16 v11, 0xe

    aput-byte v24, v15, v11

    const/16 v11, 0xf

    aput-byte v16, v15, v11

    const/16 v11, 0x10

    const/16 v12, 0x70

    aput-byte v12, v15, v11

    const/16 v11, 0x11

    const/16 v12, 0x6d

    aput-byte v12, v15, v11

    const/16 v11, 0x12

    aput-byte v16, v15, v11

    const/16 v11, 0x13

    const/16 v12, 0x49

    aput-byte v12, v15, v11

    const/16 v11, 0x14

    const/16 v12, 0x50

    aput-byte v12, v15, v11

    const/16 v11, 0x15

    aput-byte v3, v15, v11

    const/16 v11, 0x16

    aput-byte v23, v15, v11

    const/16 v11, 0x17

    const/16 v12, 0x6b

    aput-byte v12, v15, v11

    const/16 v11, 0x18

    aput-byte v3, v15, v11

    const/16 v11, 0x19

    const/16 v12, 0x67

    aput-byte v12, v15, v11

    const/16 v11, 0x1a

    aput-byte v25, v15, v11

    const/16 v11, 0x1b

    const/16 v12, 0x4d

    aput-byte v12, v15, v11

    const/16 v11, 0x1c

    aput-byte v3, v15, v11

    const/16 v11, 0x1d

    aput-byte v5, v15, v11

    const/16 v5, 0x1e

    aput-byte v3, v15, v5

    const/16 v3, 0x1f

    const/16 v5, 0x67

    aput-byte v5, v15, v3

    const/16 v3, 0x20

    aput-byte v25, v15, v3

    const/16 v3, 0x21

    aput-byte v10, v15, v3

    invoke-direct {v13, v15}, Ljava/lang/String;-><init>([B)V

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 93
    iput-object v8, v1, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->base:Ljava/lang/Object;

    .line 94
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->appPkgName:Ljava/lang/String;

    .line 97
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v3, v8, v4

    .line 96
    invoke-static {v5, v8, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v3

    .line 102
    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    new-instance v5, Ljava/lang/String;

    new-array v8, v9, [B

    const/16 v9, 0x6d

    aput-byte v9, v8, v4

    const/16 v4, 0x50

    aput-byte v4, v8, v6

    const/16 v4, 0x4d

    aput-byte v4, v8, v7

    invoke-direct {v5, v8}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v2, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 108
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 109
    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    return-void
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "base"
        }
    .end annotation

    .line 39
    invoke-direct {p0, p1}, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->hook(Landroid/content/Context;)V

    .line 40
    invoke-super {p0, p1}, Landroidx/multidex/MultiDexApplication;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "proxy",
            "method",
            "args"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 46
    new-instance p1, Ljava/lang/String;

    const/16 v0, 0xe

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 47
    aget-object v0, p3, p1

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    .line 48
    aget-object v1, p3, v1

    check-cast v1, Ljava/lang/Number;

    .line 49
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_0

    sget-object v1, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->appPkgName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->base:Ljava/lang/Object;

    invoke-virtual {p2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/pm/PackageInfo;

    .line 51
    sget-object p3, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    array-length p3, p3

    new-array p3, p3, [Landroid/content/pm/Signature;

    iput-object p3, p2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 52
    sget-object p3, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    sget-object v1, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->signatures:[Landroid/content/pm/Signature;

    array-length v1, v1

    invoke-static {p3, p1, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/String;

    const/16 v0, 0x17

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 59
    new-instance p1, Ljava/lang/String;

    const/16 p2, 0x13

    new-array p2, p2, [B

    fill-array-data p2, :array_2

    invoke-direct {p1, p2}, Ljava/lang/String;-><init>([B)V

    return-object p1

    .line 62
    :cond_1
    iget-object p1, p0, Ltz/kwvoc/yhiphvlrg/tdetimhaqngnpgogmy;->base:Ljava/lang/Object;

    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :array_0
    .array-data 1
        0x67t
        0x65t
        0x74t
        0x50t
        0x61t
        0x63t
        0x6bt
        0x61t
        0x67t
        0x65t
        0x49t
        0x6et
        0x66t
        0x6ft
    .end array-data

    nop

    :array_1
    .array-data 1
        0x67t
        0x65t
        0x74t
        0x49t
        0x6et
        0x73t
        0x74t
        0x61t
        0x6ct
        0x6ct
        0x65t
        0x72t
        0x50t
        0x61t
        0x63t
        0x6bt
        0x61t
        0x67t
        0x65t
        0x4et
        0x61t
        0x6dt
        0x65t
    .end array-data

    :array_2
    .array-data 1
        0x63t
        0x6ft
        0x6dt
        0x2et
        0x61t
        0x6et
        0x64t
        0x72t
        0x6ft
        0x69t
        0x64t
        0x2et
        0x76t
        0x65t
        0x6et
        0x64t
        0x69t
        0x6et
        0x67t
    .end array-data
.end method
