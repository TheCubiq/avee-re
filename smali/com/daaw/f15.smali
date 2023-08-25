.class public final Lcom/daaw/f15;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gy4;


# instance fields
.field public final p:Lcom/daaw/nr4;


# direct methods
.method public constructor <init>(Lcom/daaw/nr4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/f15;->p:Lcom/daaw/nr4;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f15;->p:Lcom/daaw/nr4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/nr4;->C0(Landroid/content/Context;)V

    return-void
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method
