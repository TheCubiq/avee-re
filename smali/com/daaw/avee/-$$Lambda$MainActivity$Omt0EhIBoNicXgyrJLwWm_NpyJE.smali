.class public final synthetic Lcom/daaw/avee/-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;


# instance fields
.field private final synthetic f$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE;->f$0:Lcom/daaw/avee/MainActivity;

    return-void
.end method


# virtual methods
.method public final onNavigationItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/-$$Lambda$MainActivity$Omt0EhIBoNicXgyrJLwWm_NpyJE;->f$0:Lcom/daaw/avee/MainActivity;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/MainActivity;->lambda$onCreate$0$MainActivity(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
