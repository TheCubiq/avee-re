.class public final Lcom/daaw/jk0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final p:Lcom/daaw/jk0$d;


# direct methods
.method public constructor <init>(Lcom/daaw/jk0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jk0$e;->p:Lcom/daaw/jk0$d;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/jk0$e;->p:Lcom/daaw/jk0$d;

    invoke-interface {v0}, Lcom/daaw/jk0$d;->h()V

    return-void
.end method
