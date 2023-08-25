.class public Lcom/daaw/ld$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ld;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/b30$c;

.field public final synthetic q:Landroid/graphics/Typeface;

.field public final synthetic r:Lcom/daaw/ld;


# direct methods
.method public constructor <init>(Lcom/daaw/ld;Lcom/daaw/b30$c;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ld$a;->r:Lcom/daaw/ld;

    iput-object p2, p0, Lcom/daaw/ld$a;->p:Lcom/daaw/b30$c;

    iput-object p3, p0, Lcom/daaw/ld$a;->q:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ld$a;->p:Lcom/daaw/b30$c;

    iget-object v1, p0, Lcom/daaw/ld$a;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/daaw/b30$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
