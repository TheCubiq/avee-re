.class public Lcom/daaw/af1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/af1;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/af1;


# direct methods
.method public constructor <init>(Lcom/daaw/af1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/af1$a;->p:Lcom/daaw/af1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/af1$a;->p:Lcom/daaw/af1;

    invoke-static {v0}, Lcom/daaw/af1;->q(Lcom/daaw/af1;)V

    return-void
.end method
