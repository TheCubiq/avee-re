.class public final synthetic Lcom/daaw/ew4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/ew4;->a:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ew4;->a:Z

    check-cast p1, Lcom/daaw/hw4;

    invoke-interface {p1, v0}, Lcom/daaw/hw4;->S(Z)V

    return-void
.end method
