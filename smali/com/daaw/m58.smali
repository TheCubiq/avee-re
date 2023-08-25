.class public final synthetic Lcom/daaw/m58;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:Lcom/daaw/u68;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/u68;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m58;->p:Lcom/daaw/u68;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m58;->p:Lcom/daaw/u68;

    invoke-virtual {v0}, Lcom/daaw/u68;->R()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
