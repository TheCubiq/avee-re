.class public final synthetic Lcom/daaw/c93;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:Lcom/daaw/e93;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e93;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c93;->p:Lcom/daaw/e93;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/c93;->p:Lcom/daaw/e93;

    invoke-virtual {v0}, Lcom/daaw/e93;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
