.class public Lcom/daaw/dm1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/dm1;


# direct methods
.method public constructor <init>(Lcom/daaw/dm1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm1$a;->p:Lcom/daaw/dm1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dm1$a;->p:Lcom/daaw/dm1;

    invoke-virtual {v0}, Lcom/daaw/dm1;->B()V

    return-void
.end method
