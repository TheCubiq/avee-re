.class public Lcom/daaw/td1$a;
.super Ljava/util/TimerTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/td1;->b(ZILjava/util/Date;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/td1;


# direct methods
.method public constructor <init>(Lcom/daaw/td1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/td1$a;->p:Lcom/daaw/td1;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/td1$a;->p:Lcom/daaw/td1;

    invoke-static {v0}, Lcom/daaw/td1;->a(Lcom/daaw/td1;)V

    return-void
.end method
