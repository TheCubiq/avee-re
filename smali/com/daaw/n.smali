.class public abstract Lcom/daaw/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public transient b:Lcom/daaw/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/n;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/n;->b:Lcom/daaw/p;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/n;->a:I

    return v0
.end method
