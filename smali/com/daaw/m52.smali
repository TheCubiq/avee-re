.class public final Lcom/daaw/m52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v42;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m52;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lcom/daaw/ik5;)Lcom/daaw/m52;
    .locals 3

    new-instance v0, Lcom/daaw/m52;

    invoke-virtual {p0}, Lcom/daaw/ik5;->i()I

    move-result v1

    sget-object v2, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1, v2}, Lcom/daaw/ik5;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/m52;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const v0, 0x6e727473

    return v0
.end method
