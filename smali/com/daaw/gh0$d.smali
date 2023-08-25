.class public Lcom/daaw/gh0$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/daaw/tx0;


# direct methods
.method public constructor <init>(Lcom/daaw/tx0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gh0$d;->a:Lcom/daaw/tx0;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/tx0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gh0$d;->a:Lcom/daaw/tx0;

    return-object v0
.end method
