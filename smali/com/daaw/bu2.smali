.class public final Lcom/daaw/bu2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ps2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()[Lcom/daaw/ns2;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/ns2;

    new-instance v1, Lcom/daaw/du2;

    invoke-direct {v1}, Lcom/daaw/du2;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method
