.class public Lcom/daaw/nc1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:[S

.field public final synthetic b:Lcom/daaw/nc1;


# direct methods
.method public constructor <init>(Lcom/daaw/nc1;[S)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc1$a;->b:Lcom/daaw/nc1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/nc1$a;->a:[S

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc1$a;->b:Lcom/daaw/nc1;

    invoke-virtual {v0, p0}, Lcom/daaw/nc1;->c(Lcom/daaw/nc1$a;)V

    return-void
.end method
