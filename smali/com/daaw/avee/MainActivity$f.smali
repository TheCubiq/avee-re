.class public Lcom/daaw/avee/MainActivity$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/af0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->Q0(Lcom/daaw/tx0$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public final synthetic b:Lcom/daaw/avee/MainActivity;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$f;->b:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/MainActivity$f;->a:Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/df0;->g(Lcom/daaw/df0;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/gr1;->h(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    invoke-static {p1}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    return-void
.end method
