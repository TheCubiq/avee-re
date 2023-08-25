.class public Lcom/daaw/at1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/at1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/at1;


# direct methods
.method public constructor <init>(Lcom/daaw/at1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/at1$b;->p:Lcom/daaw/at1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/at1$b;->p:Lcom/daaw/at1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/at1;->J(I)V

    return-void
.end method
