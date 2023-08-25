.class public Lcom/daaw/ha1$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ha1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:F

.field public b:Lcom/daaw/sg0;

.field public final synthetic c:Lcom/daaw/ha1;


# direct methods
.method public constructor <init>(Lcom/daaw/ha1;FLcom/daaw/sg0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ha1$c;->c:Lcom/daaw/ha1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/ha1$c;->a:F

    iput-object p3, p0, Lcom/daaw/ha1$c;->b:Lcom/daaw/sg0;

    return-void
.end method
