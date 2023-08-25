.class public Lcom/daaw/nn$a;
.super Landroid/database/ContentObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nn;


# direct methods
.method public constructor <init>(Lcom/daaw/nn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nn$a;->a:Lcom/daaw/nn;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onChange(Z)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/nn$a;->a:Lcom/daaw/nn;

    invoke-virtual {p1}, Lcom/daaw/nn;->i()V

    return-void
.end method
