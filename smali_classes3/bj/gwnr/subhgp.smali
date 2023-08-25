.class public Lbj/gwnr/subhgp;
.super Ljava/lang/Object;
.source "SigningInfo.java"


# static fields
.field static sig_data:Ljava/lang/String; = "AQAAAwcwggMDMIIB66ADAgECAgR/NichMA0GCSqGSIb3DQEBCwUAMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTAeFw0xNTA2MTcyMjAzMzBaFw00NTA2MDkyMjAzMzBaMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKcnQyyCJad1LlUs390771S5wf9aB1RQgBjrevJVwoeJ66qjWAftTZElly/nSmQuMBbe33Qqwc6sWBJc83arhH/Cj8ka+f71fBxC/Vc52kX7QygjtfQpkrEtEr4DoCdyT+MYq9BowCVKwphwarjrmpAm7BNklWdzqle+NgayYbJaSsoe3aWJCR/M/uKt2swMJPBFdv4RjNPqZGoO2/nC07pqG4NXDhyZ/oIwWRzmlunO/pdncT5OfWtwqHZUL4x/PiXFyU0S1XCeGy+nFb4u8ISU2vAks6nnXw+VodULW2tAVm7+/h7xdWdK1RdyWDc0IkpnaP323xqdKBSFarHnrBsCAwEAAaMhMB8wHQYDVR0OBBYEFIHW1i+nfP+N4ISKE0BnomCNmzX8MA0GCSqGSIb3DQEBCwUAA4IBAQCQqowpU4khL441yng9Heyp4E6KU1jVvtL2lPOZrS9wLW+PqWfHh2PyuauSGBLtHb3UIscrGgTwfcstpDvCf35ucLAuCQVqaaf3WEeMPph7/ldtOXA4yt9JYUwbEFpMJjp+9+zwj2+h84hmj8Q1BXHH2NVyb7NA3/u6HA940coyobvObkskST/Aq/4k31LLMB6coL7vD8lSVjCuiqjnQd6SStaPkhPXEi5KawV4gP+geGgq8+/5tbInn7rza7V3kXg1v5UR6/0lmyLWTYnuTS681UnhJ1jhEB5+rLocLG4ftEN54cA4VzkX9Cn2XgyOKrtAjmQsk4+HnCzpPjNvrdLC"

.field public static signatures:[Landroid/content/pm/Signature;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()V
    .locals 6

    .line 52
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    sget-object v2, Lbj/gwnr/subhgp;->sig_data:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 53
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    new-array v2, v1, [[B

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 55
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v5

    new-array v5, v5, [B

    aput-object v5, v2, v4

    .line 56
    aget-object v5, v2, v4

    invoke-virtual {v0, v5}, Ljava/io/DataInputStream;->readFully([B)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 58
    :cond_0
    new-array v0, v1, [Landroid/content/pm/Signature;

    sput-object v0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    .line 59
    :goto_1
    sget-object v0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    array-length v1, v0

    if-ge v3, v1, :cond_1

    .line 60
    new-instance v1, Landroid/content/pm/Signature;

    aget-object v4, v2, v3

    invoke-direct {v1, v4}, Landroid/content/pm/Signature;-><init>([B)V

    aput-object v1, v0, v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 63
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public static getApkContentsSigners()[Landroid/content/pm/Signature;
    .locals 1

    .line 77
    sget-object v0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    if-nez v0, :cond_0

    .line 78
    invoke-static {}, Lbj/gwnr/subhgp;->a()V

    .line 79
    sget-object v0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    :cond_0
    return-object v0
.end method

.method public static getSigningCertificateHistory(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;
    .locals 0

    .line 38
    invoke-virtual {p0}, Landroid/content/pm/SigningInfo;->hasMultipleSigners()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 41
    :cond_0
    sget-object p0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    if-nez p0, :cond_1

    .line 42
    invoke-static {}, Lbj/gwnr/subhgp;->a()V

    .line 43
    sget-object p0, Lbj/gwnr/subhgp;->signatures:[Landroid/content/pm/Signature;

    :cond_1
    return-object p0
.end method
