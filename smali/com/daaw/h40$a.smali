.class public Lcom/daaw/h40$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/h40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:[F

.field public final synthetic b:Lcom/daaw/h40;


# direct methods
.method public constructor <init>(Lcom/daaw/h40;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h40$a;->b:Lcom/daaw/h40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/daaw/h40$a;->a:[F

    return-void
.end method
