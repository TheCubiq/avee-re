.class public Lcom/daaw/m30$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/m30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/daaw/m30;


# direct methods
.method public constructor <init>(Lcom/daaw/m30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/m30$b;->b:Lcom/daaw/m30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/m30$b;->a:I

    return-void
.end method
